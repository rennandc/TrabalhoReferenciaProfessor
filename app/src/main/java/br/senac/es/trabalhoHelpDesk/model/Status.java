package br.senac.es.trabalhoHelpDesk.model;

public enum Status {


    ENVIADA {
        @Override
        public String toString() {
            return "ENVIADA";
        }

    },
    NAOENVIADA {
        @Override
        public String toString() {
            return "NÃO ENVIADA";

        }
    },
    SOLUCIONADOS {
        @Override
        public String toString() {
            return "SOLUCIONADO";

        }
    }
}
