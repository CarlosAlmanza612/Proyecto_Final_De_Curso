package modelos;

/**
 * Clase Usuario implementa Serializable, contiene constructores , propiedades
 * con sus getters y setters para poder realizar las operaciones y poder
 * trabajar con la tabla Cliente de la BBDD
 * @author Carlos Halberth Almanza Lopez 
 */
public class Usuario implements java.io.Serializable {

    /*
*   Propiedades
     */
    private Integer idUsuario;
    private String usuario;
    private String password;
    private Boolean admin;
    private Boolean disponible = true;

    /*
*   Constructores
     */
    public Usuario() {
    }

    public Usuario(String usuario, String password, Boolean admin) {
        this.usuario = usuario;
        this.password = password;
        this.admin = admin;
    }

    public Usuario(String usuario, String password, Boolean admin, Boolean disponible) {
        this.usuario = usuario;
        this.password = password;
        this.admin = admin;
        this.disponible = disponible;
    }

    /*
*   Getters & Setters
     */
    public Integer getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return this.admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

}
