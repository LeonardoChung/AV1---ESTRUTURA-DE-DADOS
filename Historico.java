public class Historico {
        private String id;
        private String descricao;
        private String data;
        private String hora;

        public Historico(String id, String descricao, String data, String hora) {
                this.id = id;
                this.descricao = descricao;
                this.data = data;
                this.hora = hora;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

        public String getData() {
                return data;
        }

        public void setData(String data) {
                this.data = data;
        }

        public String getHora() {
                return hora;
        }

        public void setHora(String hora) {
                this.hora = hora;
        }
}
