// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

        package intro;

        public class Main {

            public static void main(String[] args) {
                System.out.println("Hello world!");

                //javada değişken isimlendirme camel case

                String ortaMetin ="İlginizi çekebilir";
                String altMetin= "Vade süresi";

                System.out.println(ortaMetin);

                int vade = 12;

                double dolarDun = 18.13;
                double dolarBugun = 18.20;

                boolean dolarDustuMu = false;

                String okYonu= "";

                if (dolarBugun<dolarDun) {
                    okYonu = "down.svg";
                    System.out.println(okYonu);
                } else if(dolarBugun>dolarDun) {
                    okYonu = "up.svg";
                    System.out.println(okYonu);
                }
                else {
                    okYonu = "equal.svg";
                    System.out.println(okYonu);

                }

                //array-liste

                String[] krediler= {"Hızlı Kredi","Maaşını Halk","Mutlu Emekli"};


                //System.out.println(krediler[1]);
                //System.out.println(krediler[2]);

                for (int i = 0; i < krediler.length; i++) {
                    System.out.println(krediler[i]);
                }


            }

        }