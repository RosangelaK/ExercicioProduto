
package atividadeavaliativa2909;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class AtividadeAvaliativa2909 {

    static HashSet<Venda> produtos = new HashSet<>();

    public static void main(String[] args) {
        float total = 0;
        float valorAvista = 0;
        float valorAprazo;
        boolean continuar = true;
        while (continuar) {
            Venda v = new Venda(JOptionPane.showInputDialog
        ("Digite o produto"),
                    Float.parseFloat(JOptionPane.showInputDialog
        ("Digite o preço")),
                    Float.parseFloat(JOptionPane.showInputDialog
        ("Digite a quantidade")));

            produtos.add(v);
            continuar = (JOptionPane.showInputDialog("Deseja continuar s=sim")
                    .toLowerCase().equals("s"));
        }
        for (Venda v : produtos) {
            System.out.println(v.toString());
        }
        for (Venda v : produtos) {
            total = total + (v.getPreco() * v.getQuantidade());
        }
        System.out.println("Total " + total);

        valorAvista = total - ((total * 5) / 100);
        System.out.println("Valor à vista c/ 5% desc: " + valorAvista);

        valorAprazo = ((total * 10) / 100) + total;
        System.out.println("Valor à prazo c/ 10% de acréscimo: " + valorAprazo);
    }

}
