public class User {

    private Integer id ;
    private String  nome;
    private String  obs;

    public  User(){

    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getObs() {
        return obs;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public User(Integer id , String nome , String obs){
        this.id = id;
        this.nome = nome;
        this.obs = obs;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", obs='" + obs + '\'' +
                '}';
    }
}
