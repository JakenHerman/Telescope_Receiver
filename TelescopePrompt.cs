using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Telescope_Receiver
{
    class TelescopePrompt
    {

        String stackType;
        int M;

        static void Main()
        {

        }

        public void TelescopePrompter()
        {
            Console.Out.WriteLine("Input the stack size: ");
            Console.Out.WriteLine(">> ");
            try
            {
                this.M = Convert.ToInt32(Console.ReadLine());
            }
            catch (FormatException)
            {
                this.M = 5;
            }
         
            Console.Out.WriteLine(this.M);
            Console.Out.WriteLine("Stack Type Options: String, Int, Float, Double >> Select a stack type: ");

            getStackType();

            while ((this.stackType != "String") | (this.stackType != "Int") | (this.stackType != "Float") | 
                (this.stackType != "Double"))
            {
                Console.WriteLine(this.stackType + " is an invalid stack type. Try Again.");
                getStackType();
            }

            processStackType(this.stackType, this.M);

        }


        public void getStackType()
        {
            this.stackType = Convert.ToString(Console.ReadLine());
        }

        static void processStackType(String stackType, int M)
        {
            switch (stackType)
            {
                case "String":
                    stringType(M);
                    break;
                case "Int":
                    intType(M);
                    break;
                case "Float":
                    floatType(M);
                    break;
                case "Double":
                    doubleType(M);
                    break;
                default:
                    break;
            }
        }

        static void stringType(int M)
        {
            var stack = new TelescopeStack<String>();
        }

        static void intType(int M)
        {
            var stack = new TelescopeStack<int>();
        }

        static void doubleType(int M)
        {
            var stack = new TelescopeStack<double>();
        }

        static void floatType(int M)
        {
            var stack = new TelescopeStack<float>();
        }

    }

   
}
