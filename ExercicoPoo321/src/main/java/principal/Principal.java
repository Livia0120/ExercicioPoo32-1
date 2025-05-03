
package principal;
import javax.swing.JOptionPane;
import model.Empresa;

public class Principal {
    public static void main (String args []){
        Empresa empresa = new Empresa();
        
         empresa.setNome(JOptionPane.showInputDialog("digite o nome da empresa: "));
        empresa.setEndereço(JOptionPane.showInputDialog("digite o endereço: "));
        empresa.setCEP(JOptionPane.showInputDialog("digite o CEP: "));
        empresa.setCidade(JOptionPane.showInputDialog("digite a cidade: "));
        empresa.setEstado(JOptionPane.showInputDialog("digite o Estado: "));
        empresa.setFone(JOptionPane.showInputDialog("digite o telefone empresa: "));

        System.out.println(empresa.imprimir());
    }

}
