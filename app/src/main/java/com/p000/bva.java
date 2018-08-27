package com.p000;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* compiled from: $Gson$Types */
/* renamed from: bva */
public final class bva {
    /* renamed from: a */
    static final Type[] f7716a = new Type[0];

    /* compiled from: $Gson$Types */
    /* renamed from: bva$a */
    static final class C1503a implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Type f7710a;

        public C1503a(Type type) {
            this.f7710a = bva.m11132d(type);
        }

        public Type getGenericComponentType() {
            return this.f7710a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && bva.m11127a((Type) this, (GenericArrayType) obj);
        }

        public int hashCode() {
            return this.f7710a.hashCode();
        }

        public String toString() {
            return bva.m11134f(this.f7710a) + "[]";
        }
    }

    /* compiled from: $Gson$Types */
    /* renamed from: bva$b */
    static final class C1504b implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Type f7711a;
        /* renamed from: b */
        private final Type f7712b;
        /* renamed from: c */
        private final Type[] f7713c;

        public C1504b(Type type, Type type2, Type... typeArr) {
            int i = 0;
            if (type2 instanceof Class) {
                boolean z;
                Class cls = (Class) type2;
                int i2 = (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) ? 1 : 0;
                if (type == null && i2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                buz.m11116a(z);
            }
            this.f7711a = type == null ? null : bva.m11132d(type);
            this.f7712b = bva.m11132d(type2);
            this.f7713c = (Type[]) typeArr.clone();
            while (i < this.f7713c.length) {
                buz.m11115a(this.f7713c[i]);
                bva.m11136h(this.f7713c[i]);
                this.f7713c[i] = bva.m11132d(this.f7713c[i]);
                i++;
            }
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f7713c.clone();
        }

        public Type getRawType() {
            return this.f7712b;
        }

        public Type getOwnerType() {
            return this.f7711a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && bva.m11127a((Type) this, (ParameterizedType) obj);
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f7713c) ^ this.f7712b.hashCode()) ^ bva.m11117a(this.f7711a);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder((this.f7713c.length + 1) * 30);
            stringBuilder.append(bva.m11134f(this.f7712b));
            if (this.f7713c.length == 0) {
                return stringBuilder.toString();
            }
            stringBuilder.append("<").append(bva.m11134f(this.f7713c[0]));
            for (int i = 1; i < this.f7713c.length; i++) {
                stringBuilder.append(", ").append(bva.m11134f(this.f7713c[i]));
            }
            return stringBuilder.append(">").toString();
        }
    }

    /* compiled from: $Gson$Types */
    /* renamed from: bva$c */
    static final class C1505c implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Type f7714a;
        /* renamed from: b */
        private final Type f7715b;

        public C1505c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2 = true;
            buz.m11116a(typeArr2.length <= 1);
            if (typeArr.length == 1) {
                z = true;
            } else {
                z = false;
            }
            buz.m11116a(z);
            if (typeArr2.length == 1) {
                buz.m11115a(typeArr2[0]);
                bva.m11136h(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    z2 = false;
                }
                buz.m11116a(z2);
                this.f7715b = bva.m11132d(typeArr2[0]);
                this.f7714a = Object.class;
                return;
            }
            buz.m11115a(typeArr[0]);
            bva.m11136h(typeArr[0]);
            this.f7715b = null;
            this.f7714a = bva.m11132d(typeArr[0]);
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f7714a};
        }

        public Type[] getLowerBounds() {
            if (this.f7715b == null) {
                return bva.f7716a;
            }
            return new Type[]{this.f7715b};
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && bva.m11127a((Type) this, (WildcardType) obj);
        }

        public int hashCode() {
            return (this.f7715b != null ? this.f7715b.hashCode() + 31 : 1) ^ (this.f7714a.hashCode() + 31);
        }

        public String toString() {
            if (this.f7715b != null) {
                return "? super " + bva.m11134f(this.f7715b);
            }
            if (this.f7714a == Object.class) {
                return "?";
            }
            return "? extends " + bva.m11134f(this.f7714a);
        }
    }

    /* renamed from: a */
    public static ParameterizedType m11121a(Type type, Type type2, Type... typeArr) {
        return new C1504b(type, type2, typeArr);
    }

    /* renamed from: a */
    public static GenericArrayType m11120a(Type type) {
        return new C1503a(type);
    }

    /* renamed from: b */
    public static WildcardType m11129b(Type type) {
        return new C1505c(new Type[]{type}, f7716a);
    }

    /* renamed from: c */
    public static WildcardType m11131c(Type type) {
        return new C1505c(new Type[]{Object.class}, new Type[]{type});
    }

    /* renamed from: d */
    public static Type m11132d(Type type) {
        if (type instanceof Class) {
            C1503a c1503a;
            Class cls = (Class) type;
            if (cls.isArray()) {
                c1503a = new C1503a(bva.m11132d(cls.getComponentType()));
            } else {
                Object obj = cls;
            }
            return c1503a;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C1504b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C1503a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C1505c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: e */
    public static Class<?> m11133e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            buz.m11116a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(bva.m11133e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return bva.m11133e(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    /* renamed from: a */
    static boolean m11126a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m11127a(Type type, Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!(bva.m11126a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments()))) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return bva.m11127a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!(Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds()))) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (!(typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName()))) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    static int m11117a(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    /* renamed from: f */
    public static String m11134f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    static Type m11123a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return bva.m11123a(cls.getGenericInterfaces()[i], interfaces[i], (Class) cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return bva.m11123a(cls.getGenericSuperclass(), (Class) superclass, (Class) cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: b */
    static Type m11128b(Type type, Class<?> cls, Class<?> cls2) {
        buz.m11116a(cls2.isAssignableFrom(cls));
        return bva.m11124a(type, (Class) cls, bva.m11123a(type, (Class) cls, (Class) cls2));
    }

    /* renamed from: g */
    public static Type m11135g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: a */
    public static Type m11122a(Type type, Class<?> cls) {
        Type b = bva.m11128b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: b */
    public static Type[] m11130b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = bva.m11128b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: a */
    public static Type m11124a(Type type, Class<?> cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            type3 = (TypeVariable) type3;
            type2 = bva.m11125a(type, (Class) cls, (TypeVariable) type3);
            if (type2 == type3) {
                return type2;
            }
            type3 = type2;
        }
        Type componentType;
        Type a;
        if ((type3 instanceof Class) && ((Class) type3).isArray()) {
            Class cls2 = (Class) type3;
            componentType = cls2.getComponentType();
            a = bva.m11124a(type, (Class) cls, componentType);
            if (componentType != a) {
                return bva.m11120a(a);
            }
            return cls2;
        } else if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            componentType = genericArrayType.getGenericComponentType();
            a = bva.m11124a(type, (Class) cls, componentType);
            if (componentType != a) {
                return bva.m11120a(a);
            }
            return genericArrayType;
        } else if (type3 instanceof ParameterizedType) {
            int i;
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            componentType = parameterizedType.getOwnerType();
            Type a2 = bva.m11124a(type, (Class) cls, componentType);
            if (a2 != componentType) {
                i = 1;
            } else {
                i = 0;
            }
            r4 = parameterizedType.getActualTypeArguments();
            int length = r4.length;
            int i2 = i;
            r1 = r4;
            for (int i3 = 0; i3 < length; i3++) {
                Type a3 = bva.m11124a(type, (Class) cls, r1[i3]);
                if (a3 != r1[i3]) {
                    if (i2 == 0) {
                        r1 = (Type[]) r1.clone();
                        i2 = 1;
                    }
                    r1[i3] = a3;
                }
            }
            if (i2 != 0) {
                return bva.m11121a(a2, parameterizedType.getRawType(), r1);
            }
            return parameterizedType;
        } else if (!(type3 instanceof WildcardType)) {
            return type3;
        } else {
            WildcardType wildcardType = (WildcardType) type3;
            r1 = wildcardType.getLowerBounds();
            r4 = wildcardType.getUpperBounds();
            if (r1.length == 1) {
                a = bva.m11124a(type, (Class) cls, r1[0]);
                if (a != r1[0]) {
                    return bva.m11131c(a);
                }
                return wildcardType;
            } else if (r4.length != 1) {
                return wildcardType;
            } else {
                componentType = bva.m11124a(type, (Class) cls, r4[0]);
                if (componentType != r4[0]) {
                    return bva.m11129b(componentType);
                }
                return wildcardType;
            }
        }
    }

    /* renamed from: a */
    static Type m11125a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = bva.m11119a((TypeVariable) typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = bva.m11123a(type, (Class) cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[bva.m11118a(a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    private static int m11118a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m11119a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        return genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
    }

    /* renamed from: h */
    static void m11136h(Type type) {
        boolean z = ((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true;
        buz.m11116a(z);
    }
}
