package Project;




    /*
Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class.
 After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, '
 username and password.
Requirements:
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.
 */
    public class Registration {
        private String mail;
        private String userName;
        private String password;

        public static void main(String[] args) {
            Registration registration = new Registration();
            registration.SetUsersMail("vasyl@yahoo.com");
            registration.SetUserName("bar1234");
            registration.SetPassword("1234rty");
        }
        void SetUsersMail(String mail) {
            if (mail.contains("yahoo")) {
                System.out.println("It is corect");
            } else {
                System.out.println("Try yahoo");
            }
        }

        void SetUserName(String userName) {
            if (!userName.isEmpty() || userName.length() > 6) {
                System.out.println("userName successfully created");

            }else{
                System.out.println("userName should be have more then 6 characters");
            }
        }
        void SetPassword(String password){
            if(!password.isEmpty()||password.length()>6||!password.contains(userName)){
                System.out.println("Password successfully created");

            }else {
                System.out.println("Password should be have more then 6 characters and not contain userName");
            }

        }
    }


