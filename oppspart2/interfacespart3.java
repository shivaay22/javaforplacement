interface camera
{
    void takesnap();
    void recorvedio();
    default void recordin4k()
    {
        System.out.println("Recording in 4k");
    }
    private int num(int n)
    {
        System.out.println("This is private number");
        return n;
    }
}
interface wifi
{
    String[] getNetworks();
    void connecttonetwork(String network);
}
class smartPhone
{
    smartPhone()
    {
        System.out.println("Smartphone");
    }
}
class MycellPhone extends smartPhone implements camera,wifi
{
    void callNumber(int number)
    {
        System.out.println("Calling this nuber: " + number);
    }
    void pickcall()
    {
        System.out.println("Conneccting....");
    }

    public void takesnap()
    {
        System.out.println("Taking snap");
    }
    public void recorvedio()
    {
        System.out.println("Recording video");
    }
    public String[] getNetworks()
    {
        System.out.println("Getting list of network");
        String[] newworks = {"harry","Prashanmt"};
        return newworks;
    }
    public void connecttonetwork(String net)
    {
        System.out.println("Network connected"+net);
    }
}
public class interfacespart3 {
    public static void main(String[] args) {
        MycellPhone c1 = new MycellPhone();
        String[] ar = c1.getNetworks();
        for(String item:ar)
        {
            System.out.println(item);
        }

        camera c3 = new MycellPhone();
        c3.recordin4k();
        // c3.callNumber();->not allowed to use
    }
}
