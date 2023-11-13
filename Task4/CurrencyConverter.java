import java.util.TreeMap;
import java.util.Scanner;
class CurrencyConverter
{
    public static void main(String args[])
    {
        TreeMap<String,Double> currencyapi = new TreeMap<>();
        currencyapi.put("USDtoINR",0.0120);
        currencyapi.put("USDtoEUR",0.9351);
        currencyapi.put("USDtoCAD",1.3806);
        currencyapi.put("USDtoAUD",1.5694);
        currencyapi.put("USDtoJPY",151.7900);

        currencyapi.put("INRtoUSD",0.0120);
        currencyapi.put("INRtoEUR",0.01123);
        currencyapi.put("INRtoCAD",0.01657);
        currencyapi.put("INRtoAUD",0.01657);
        currencyapi.put("INRtoJPY",1.8220);

        currencyapi.put("EURtoUSD",1.0689);
        currencyapi.put("EURtoINR",89.0610);
        currencyapi.put("EURtoCAD",1.4754);
        currencyapi.put("EURtoAUD",1.6772);
        currencyapi.put("EURtoJPY",162.2600);

        currencyapi.put("CADtoUSD",0.7243);
        currencyapi.put("CADtoINR",60.0610);
        currencyapi.put("CADtoEUR",0.6774);
        currencyapi.put("CADtoAUD",1.1364);
        currencyapi.put("CADtoJPY",109.2600);

        currencyapi.put("AUDtoUSD",0.6890);
        currencyapi.put("AUDtoINR",53.0790);
        currencyapi.put("AUDtoCAD",0.8796);
        currencyapi.put("AUDtoEUR",0.5962);
        currencyapi.put("AUDtoJPY",96.2600);

        currencyapi.put("JPYtoUSD",0.006586);
        currencyapi.put("JPYtoINR",0.5485);
        currencyapi.put("JPYtoCAD",0.00909);
        currencyapi.put("JPYtoAUD",0.01033);
        currencyapi.put("JPYtoEUR",0.006162);

        System.out.println("--------------------------------");
        System.out.println("CURRENCY CONVERTER");
        System.out.println("--------------------------------");
        int cnt;
        String bccpy=null;
        Double bamt=0.01;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("Select Your Base Currency:\n1.USD for Us Dollar\n2.INR for Indian Rupees \n3.EUR for Euro\n4.CAD for Canada Dollar\n5.AUD for Australia Dollar\n6.JPY for Japan Yen");
           
            String bc = sc.nextLine();
            bccpy=bc;
            
            String ch=bc.toLowerCase();
            cnt=1;
            if(ch.equals("usd"))
            {
                System.out.println("Enter Your Amount $");
                bamt=sc.nextDouble();
            }
            else if(ch.equals("inr"))
            {
                System.out.println("Enter Your Amount ₹");
                bamt=sc.nextDouble();
            }
            else if(ch.equals("aud"))
            {
                System.out.println("Enter Your Amount $");
                bamt=sc.nextDouble();
            }
            else if(ch.equals("cad"))
            {
                System.out.println("Enter Your Amount $");
                bamt=sc.nextDouble();
            }
            else if(ch.equals("eur"))
            {
                System.out.println("Enter Your Amount $");
                bamt=sc.nextDouble();
            }
            else if(ch.equals("jpy"))
            {
                System.out.println("Enter Your Amount ¥");
                bamt=sc.nextDouble();
            }
            else
            {
                System.out.println("You may have selected wrong option");
                cnt=0;
            }
        }while(cnt==0);
        
       String tccpy=null;
       Double conversion_value;
        do{
            cnt=1;
            System.out.println("Select Target Currency:\n1.USD for Us Dollar\n2.INR for Indian Rupees \n3.EUR for Euro\n4.CAD for Canada Dollar\n5.AUD for Australia Dollar\n6.JPY for Japan Yen");
            String tc =sc.next();
            tc=tc.toLowerCase();
            tccpy=tc;
            String search = (bccpy.toUpperCase().concat("to")).concat(tc.toUpperCase());
            System.out.println(search);
            conversion_value= currencyapi.get(search);
            if(tc.equals(bccpy))
            {
                System.out.println("you are conversion is of same type...Please select different currency...");
            }
            else if(!tc.equals("jpy") && !tc.equals("eur") && !tc.equals("usd") && !tc.equals("inr") && !tc.equals("cad") && !tc.equals("aud"))
            {
                System.out.println("You may have selected wrong option");
                cnt=0;
            }
        }while(cnt==0);
        Double result = bamt*conversion_value;
        String sym;
        if(tccpy.equalsIgnoreCase("JPY"))
        {
            sym="¥";
        }
        else if(tccpy.equalsIgnoreCase("inr"))
        {
            sym="₹";
        }
        else
        {
            sym="$";
        }
        System.out.println(bccpy.toUpperCase()+" to "+tccpy.toUpperCase()+" Currency Rate: "+sym+result);
    }
}