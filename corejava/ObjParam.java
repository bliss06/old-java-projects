public class ObjParam {
    public static void main(String[] args) {
        TestObj t = new TestObj();
        System.out.println(t);
        changeValues(t);
        System.out.println(t);
        changeValues(t);
        System.out.println(t);
        changeValues(t);
        System.out.println(t);
        System.out.println(t instanceof Object); //even if its a superclass check, comparison is true
        System.out.println(t.getClass());

    }
    public static void changeValues(TestObj t){
        t.intValue += 1;
        t.stringValue += " - Changed";

    }
}

class TestObj{
    public int intValue = 0;
    public String stringValue = "Hello";

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + intValue;
        result = prime * result + ((stringValue == null) ? 0 : stringValue.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TestObj other = (TestObj) obj;
        if (intValue != other.intValue)
            return false;
        if (stringValue == null) {
            if (other.stringValue != null)
                return false;
        } else if (!stringValue.equals(other.stringValue))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TestObj [intValue=" + intValue + ", stringValue=" + stringValue + "]";
    }
}
