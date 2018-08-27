package com.p000;

import java.util.Hashtable;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: drc */
public class drc extends DefaultHandler implements dqw {
    /* renamed from: a */
    private static final rk f22651a = dnn.m28258a(drc.class);
    /* renamed from: b */
    private Stack f22652b = new Stack();
    /* renamed from: c */
    private StringBuffer f22653c = null;
    /* renamed from: d */
    private StringBuffer f22654d = null;
    /* renamed from: e */
    private String f22655e = null;
    /* renamed from: f */
    private String f22656f = null;
    /* renamed from: g */
    private double f22657g = 0.0d;
    /* renamed from: h */
    private Vector f22658h = new Vector();
    /* renamed from: i */
    private Hashtable f22659i = new Hashtable();

    /* renamed from: a */
    private void m28801a(dqs dqs) {
        if (!this.f22658h.isEmpty()) {
            for (int i = 0; i < this.f22658h.size(); i++) {
                if (((dqs) this.f22658h.elementAt(i)).mo4553a() < dqs.mo4553a()) {
                    this.f22658h.insertElementAt(dqs, i);
                    return;
                }
            }
        }
        this.f22658h.addElement(dqs);
    }

    /* renamed from: b */
    private void m28802b() throws SAXException {
        if (this.f22652b.isEmpty() || this.f22652b.peek() != "input") {
            throw new SAXException("End Element> The top of the stack does not contain the token interpretation");
        } else if (this.f22655e == null) {
            throw new SAXException("Did not get any timings from input");
        } else if (this.f22653c == null) {
            throw new SAXException("Did not get any character from input");
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(this.f22653c.toString(), " ");
            StringTokenizer stringTokenizer2 = new StringTokenizer(this.f22655e, ",");
            StringTokenizer stringTokenizer3 = this.f22656f != null ? new StringTokenizer(this.f22656f, ",") : null;
            this.f22653c = null;
            this.f22655e = null;
            this.f22656f = null;
            if (stringTokenizer.countTokens() != stringTokenizer2.countTokens()) {
                throw new SAXException("timing(" + stringTokenizer2.countTokens() + ") and inputs(" + stringTokenizer.countTokens() + ") information does not have the same number of items");
            }
            dqs dqs = new dqs();
            dqs.m28758a(this.f22657g);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                String nextToken2 = stringTokenizer2.nextToken();
                double d = 0.0d;
                if (stringTokenizer3 != null) {
                    d = Double.parseDouble(stringTokenizer3.nextToken());
                }
                dqs.m28760a(new dqt(nextToken, Long.parseLong(nextToken2.substring(0, nextToken2.indexOf("-"))), Long.parseLong(nextToken2.substring(nextToken2.indexOf("-") + 1)), d, true, (byte) 0));
            }
            m28801a(dqs);
        }
    }

    /* renamed from: a */
    public final dqn mo4556a() {
        Vector vector = this.f22658h;
        Hashtable hashtable = this.f22659i;
        return new dqr(vector);
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        if (f22651a.mo4274a()) {
            f22651a.mo4272a("Received characters: " + new String(cArr, i, i2));
        }
        if (!this.f22652b.isEmpty() && this.f22652b.peek() == "input") {
            if (this.f22653c == null) {
                this.f22653c = new StringBuffer(i2);
            }
            this.f22653c.append(cArr, i, i2);
        } else if (!this.f22652b.isEmpty() && this.f22652b.peek() == "NSS_Audio_Statistics") {
            if (this.f22654d == null) {
                this.f22654d = new StringBuffer(i2);
            }
            this.f22654d.append(cArr, i, i2);
        }
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        if (f22651a.mo4274a()) {
            f22651a.mo4272a("Received endElement " + str2);
        }
        if (str2.equals("result")) {
            if (this.f22652b.isEmpty() || this.f22652b.peek() != "result") {
                throw new SAXException("End Element> The top of the stack does not contain the token result");
            }
            this.f22652b.pop();
        } else if (str2.equals("interpretation")) {
            if (this.f22652b.isEmpty() || this.f22652b.peek() != "interpretation") {
                throw new SAXException("End Element> The top of the stack does not contain the token interpretation");
            }
            this.f22652b.pop();
        } else if (str2.equals("input")) {
            m28802b();
            this.f22652b.pop();
        } else if (str2.equals("NSS_Audio_Statistics")) {
            if (this.f22652b.isEmpty() || this.f22652b.peek() != "NSS_Audio_Statistics") {
                throw new SAXException("End Element> The top of the stack does not contain the token NSS_Audio_Statistics");
            }
            this.f22652b.pop();
        } else if (!this.f22652b.isEmpty() && this.f22652b.peek() == "NSS_Audio_Statistics") {
            Object trim = this.f22654d == null ? "" : this.f22654d.toString().trim();
            if (str2.equals("InputAudioLength")) {
                this.f22659i.put("IAL", trim);
            }
            this.f22659i.put(str2, trim);
            this.f22654d = null;
        }
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (f22651a.mo4274a()) {
            f22651a.mo4272a("Received startElement " + str2);
        }
        if (str2.equals("result")) {
            if (this.f22652b.size() != 0) {
                throw new SAXException("StartElement> Found result but it is not the first token.");
            }
            this.f22652b.push("result");
        } else if (str2.equals("interpretation")) {
            if (this.f22652b.isEmpty() || this.f22652b.peek() != "result") {
                throw new SAXException("StartElement> The interpretation token was found without a result being opened before.");
            }
            this.f22652b.push("interpretation");
            String value = attributes.getValue("timing");
            String value2 = attributes.getValue("confidence");
            String value3 = attributes.getValue("word_confidence");
            if (value == null) {
                throw new SAXException("StartElement> There are no timings associated with this interpretation.");
            } else if (value2 == null) {
                throw new SAXException("StartElement> There is no confidence associated with this interpretation.");
            } else {
                this.f22655e = value;
                this.f22656f = value3;
                try {
                    this.f22657g = Double.parseDouble(value2);
                } catch (Exception e) {
                    throw new SAXException("StartElement> Could not parse the confidence: " + value2, e);
                }
            }
        } else if (str2.equals("input")) {
            if (this.f22652b.isEmpty() || this.f22652b.peek() != "interpretation") {
                throw new SAXException("StartElement> The input token was found without a interpretation being opened before.");
            }
            this.f22652b.push("input");
        } else if (!str2.equals("NSS_Audio_Statistics")) {
        } else {
            if (this.f22652b.isEmpty() || this.f22652b.peek() != "result") {
                throw new SAXException("StartElement> The NSS_Audio_Statistics token was found without a result being opened before.");
            }
            this.f22652b.push("NSS_Audio_Statistics");
        }
    }
}
