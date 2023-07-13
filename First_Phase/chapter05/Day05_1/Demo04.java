package Day05_1;
//4、设计微信账号类，每个微信账号都有微信号、手机号、昵称等信息
public class Demo04 {
    public static void main(String[] args) {
        VxMessage vxMessage = new VxMessage();

    }
    static public class VxMessage{
        private int vxid;
        private int phoneNumber;
        private String vxName;

        public VxMessage() {
        }

        public VxMessage(int vxid, int phoneNumber, String vxName) {
            this.vxid = vxid;
            this.phoneNumber = phoneNumber;
            this.vxName = vxName;
        }

        public int getVxid() {
            return vxid;
        }

        public void setVxid(int vxid) {
            this.vxid = vxid;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getVxName() {
            return vxName;
        }

        public void setVxName(String vxName) {
            this.vxName = vxName;
        }
    }
}
