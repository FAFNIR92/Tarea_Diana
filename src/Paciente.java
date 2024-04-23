public class Paciente {
    private String meguissethCedula;
    private String meguissethNombre;
    private String meguissethApellido;
    private String meguissethCorreo;
    private String meguissethTelefono;
    private String meguissethFechaNacimiento;

    // Constructor vacío
    public Paciente() {
    }

    // Constructores para cada atributo
    public Paciente(String meguissethCedula) {
        this.meguissethCedula = meguissethCedula;
    }

    public Paciente(String meguissethCedula, String meguissethNombre) {
        this.meguissethCedula = meguissethCedula;
        this.meguissethNombre = meguissethNombre;
    }

    public Paciente(String meguissethCedula, String meguissethNombre, String meguissethApellido) {
        this.meguissethCedula = meguissethCedula;
        this.meguissethNombre = meguissethNombre;
        this.meguissethApellido = meguissethApellido;
    }

    // Constructor con todos los atributos
    public Paciente(String meguissethCedula, String meguissethNombre, String meguissethApellido, String meguissethCorreo, String meguissethTelefono, String meguissethFechaNacimiento) {
        this.meguissethCedula = meguissethCedula;
        this.meguissethNombre = meguissethNombre;
        this.meguissethApellido = meguissethApellido;
        this.meguissethCorreo = meguissethCorreo;
        this.meguissethTelefono = meguissethTelefono;
        this.meguissethFechaNacimiento = meguissethFechaNacimiento;
    }

    // Métodos "meguisseth" para cada atributo
    public void meguissethCedula(String meguissethCedula) {
        this.meguissethCedula = meguissethCedula;
    }

    public void meguissethNombre(String meguissethNombre) {
        this.meguissethNombre = meguissethNombre;
    }

    public void meguissethApellido(String meguissethApellido) {
        this.meguissethApellido = meguissethApellido;
    }

    public void meguissethCorreo(String meguissethCorreo) {
        this.meguissethCorreo = meguissethCorreo;
    }

    public void meguissethTelefono(String meguissethTelefono) {
        this.meguissethTelefono = meguissethTelefono;
    }

    public void meguissethFechaNacimiento(String meguissethFechaNacimiento) {
        this.meguissethFechaNacimiento = meguissethFechaNacimiento;
    }

    public static void main(String[] args) {
        // Aquí puedes escribir código para probar la clase Paciente si lo necesitas
    }
}
