
public class Pessoas{
		private String name;
		private Enderešo enderešo;
		private int cod;
		public Pessoas(String name,Enderešo enderešo,int cod) {
			this.name = name;
			this.enderešo=enderešo;
			this.cod=cod;;
		}
		public Pessoas() {
		}
		
		public Enderešo getEnderešo() {
			return enderešo;
		}
		public void setEnderešo(Enderešo enderešo) {
			this.enderešo = enderešo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void imprimePessoa() {
			System.out.println(this.name);
		}
		public int getCod() {
			return cod;
		}
		public void setCod(int cod) {
			this.cod = cod;
		}
	}