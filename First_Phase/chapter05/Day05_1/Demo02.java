package Day05_1;
//设计男人类，每个男人都有身份证号、姓名、性别、女人。设计女人类，每个女人都
//        有身份证号、姓名、性别、男人。

public class Demo02 {
    public void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

    }
    class Human{
        private int ID;
        private String Name;
        private boolean sex;

        public Human() {
        }

        public Human(int ID, String name, boolean sex) {
            this.ID = ID;
            Name = name;
            this.sex = sex;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public boolean isSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }
    }
    class Man extends Human{
        boolean sex = false;
        Woman woman;
        @Override
        public boolean isSex() {
            return sex;
        }

        @Override
        public void setSex(boolean sex) {
            this.sex = sex;
        }

        public Man() {
        }

        public Man(Woman woman) {
            this.woman = woman;
        }

        public Man(int ID, String name, boolean sex, boolean sex1, Woman woman) {
            super(ID, name, sex);
            this.sex = sex1;
            this.woman = woman;
        }

    }
    class Woman extends Human{

        boolean sex = true;
        Man man;

        public Woman(int ID, String name, boolean sex, boolean sex1, Man man) {
            super(ID, name, sex);
            this.sex = sex1;
            this.man = man;
        }

        public Woman() {
        }

        public Woman(Man man) {
            this.man = man;
        }

        @Override
        public boolean isSex() {
            return sex;
        }

        @Override
        public void setSex(boolean sex) {
            this.sex = sex;
        }
    }
}
