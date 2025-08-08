class SuperClasse {

    SuperClasse() {
        System.out.println("o animal está em perigo");
    }

    public void somDoGato() {
        System.out.println("o gato faz:");
    }

    static class Classe extends SuperClasse {
        @Override
        public void somDoGato() {
            super.somDoGato();

            System.out.println("miaaauu");
        }

        public static void main(String[] args) {
            Classe obj = new Classe();
            obj.somDoGato();
        }

    }
}
