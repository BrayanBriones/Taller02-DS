public class LogInAdmin implements IAdminLogin {
    private boolean userIsAdmin;
    @Override
    public void logAdmin(User user) {
        if (verifyIfTheUserIsAdmin(user)) {
            System.out.println("Has ingresado en modo admin");
            // Logic for admin login
        } else {
            System.out.println("Acceso denegado, no eres admin");
        }
    }
    private boolean verifyIfTheUserIsAdmin(User user){
        // Do something
        return true;
    }
}