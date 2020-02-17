package OOP.theory.Enum.Example_02;

public enum  Direction {

    UP{
        public void printDirection(){
            System.out.println(UP);
        }
    },

    DOWN{
        public void printDirection(){
            System.out.println(DOWN);
        }
    },

    RIGHT{
        public void printDirection(){
            System.out.println(RIGHT);
        }
    },

    LEFT{
        public void printDirection(){
            System.out.println(LEFT);
        }
    };

    public abstract void printDirection();
}
