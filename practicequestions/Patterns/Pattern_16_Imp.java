package practicequestions.Patterns;

public class Pattern_16_Imp {
    public static void main(String[] args) {
        test(7);
    }

    public static void test(int n)
    {
        boolean flag = true;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {

                if(i%2 == 0)
                {
                    if(j%2 == 0)
                    {
                        if (flag) {
                            System.out.print("L\t");
                            flag = false;
                        }

                        else {
                            System.out.print("R\t");
                            flag = true;
                        }
                    }
                    else
                    {
                        System.out.print("_\t");
                    }
                }


                else
                {
                    if(j%2 == 0)
                    {
                        System.out.print("_\t");
                    }

                    else
                    {
                        if(flag)
                        {
                            System.out.print("L\t");
                            flag = false;
                        }

                        else
                        {
                            System.out.print("R\t");
                            flag = true;
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
