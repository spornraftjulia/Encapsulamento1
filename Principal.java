public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Julia", 17, "spornraft", "1998");

        System.out.println("nome: "+usuario.getNome());
        System.out.println("Idade: "+usuario.getIdade());
        System.out.println("Username: "+usuario.getUsername());
        usuario.setSenha("Etec2023");

        if(usuario.verificaSenha("Etec123")){
            System.out.println("senha válida");
        }else{
            System.out.println("senha inválida");
        }
    }
    
}
 