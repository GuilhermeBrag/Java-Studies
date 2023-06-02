import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Principal2 {

    public static void main(String[] args) {
		var funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
		funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
		funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
		funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

		// Passo a passo - Utilizando Method Reference

		// TODO remover funcionários inativos
		Predicate<Funcionario> funcionarioInativosPredicate = Funcionario::isInativo;
		funcionarios.removeIf(funcionarioInativosPredicate);

		// TODO ordenar funcionários pelo valor do salário
		Function<Funcionario,BigDecimal> ordenarSalario = Funcionario::getSalario;
		funcionarios.sort(Comparator.comparing(ordenarSalario));

		// TODO iterar e imprimir funcionários usando o método estático imprimir
		Consumer<Funcionario> funcionarioConsumer = Principal2::imprimir;
		funcionarios.forEach(funcionarioConsumer);



	}

	private static void imprimir(Funcionario funcionario) {
		// TODO implementar a impressão do nome, salário e impostos (20%)
		System.out.printf("Nome: - %s | Salario: %.2f | Impostos: %.2f %n", funcionario.getNome(), funcionario.getSalario(),
				funcionario.getSalario().multiply(new BigDecimal("0.2")));
	}

}