public class Demo {
    public static void main(String[] args) {
        Mac mac = new Mac("Mac", 3, 4, "Intel Core i5", "Li-on", "Avira");
        mac.tampilMac();

        Windows win = new Windows("Windows", 2, 8, "Intel Core i7", "Li-on", "Dark mode");
        win.tampilWindows();

        Pc pc = new Pc("Pc", 4, 8, "Intel Core i3", 10);
        pc.tampilPc();
    }
}
