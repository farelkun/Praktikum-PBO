public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        if (perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan Televisi jadul dengan input: DIV");
            System.out.println("Voltase Televisi : "+perangkat.getVoltase());
        }
        else if(perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan Televisi jadul dengan input: HDMI");
            System.out.println("Voltase Televisi : "+perangkat.getVoltase());
        }
    }
}
