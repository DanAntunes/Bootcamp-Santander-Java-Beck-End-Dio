package main.list.operacoesbasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
  // atributo
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa t : tarefaList) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obeterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    System.out.print(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    System.out.println("O numero total de elementos na lista é: " + listaTarefa.obeterNumeroTotalTarefas());

    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");
    System.out.println("O numero total de elementos na lista é: " + listaTarefa.obeterNumeroTotalTarefas());

    listaTarefa.removerTarefa("Tarefa 2");
    System.out.println("O numero total de elementos na lista é: " + listaTarefa.obeterNumeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();
  }
}
