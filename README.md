# Prática de Git e Github Básico

Vamos iniciar a trabalhar em equipe usando git e github. Assim:

* Clone este repositório, crie um repositório no github, ajuste as configurações para que todos do grupo sejam colaboradores e possam atualizar o mesmo, a configure seu repositório local para que ele sincronize com o novo repositório remoto:
  * ```git remote set-url origin link-do-seu-github```
* Em grupos de 3 pessoas, desenvolva uma classe que implementa os métodos descritos abaixo:

```
        a. Método que retorna quantas ocorrências de um elemento estão na lista
        			int nOcorrencias(ArrayList<Integer> l, Integer el)
        
        b. Método que retorna true se l tem elementos repetidos
            		boolean hasRepeat(ArrayList< Integer > l)
        
        c. Método que retorna o número de elementos repetidos em l
        		int nroRepeat(ArrayList< Integer > l)
        
        d. Método que retorna uma lista de elementos repetidos de l
        		 ArrayList<Integer> listRepeat(ArrayList< Integer > l)
        
        e. Método que retorna a união de l1 e l2
        		ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2)
        
        f. Método que retorna a intersecção de l1 e l2
        		ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2)
```

  * Organize o grupo de forma que uma pessoa desenvolva os métodos "a" e "d", outra o "b" e "e" e outra o "c" e "f".
  * A cada método finalizado, faça commit e compartilhe no github. Lembre-se: se alguém tiver atualizado o repositório anteriormente, 
será necessário fazer o "pull" e resolver os conflitos.

No final, compartilhe o link no forum do moodle.


Opção 1)

O dono de uma rede de bares da cidade nos encomendou um sistema em Java para rodar em tablets, para controlar 
o acesso de clientes ao bar. O proprietário deseja que, ao entrar no bar,  cliente informe seu nome, cpf, idade e gênero. 
A qualquer momento, ele deseja ser capaz de consultar quem são as pessoas que estão no bar, se alguém com um 
determinado CPF está no bar, quantas são as pessoas e qual a distribuição por gênero (percentual de clientes 
masculinos e femininos). Ao sair, o cliente deve informar seu CPF, para registrar sua saída.

Modele este sistema (defina classes, com seus atributos e métodos), decida quem implementará o que e faça o
desenvolvimento usando o git e o github.
