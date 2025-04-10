package org.serratec.exemplos;

public enum EstadoCivil {
    SOLTEIRO('S'), CASADO('C'), DIVORCIADO('D'), VIUVO('V');

    private char sigla;

    EstadoCivil(char sigla) {
        this.sigla = sigla;
    }

    public char getSigla() {
        return sigla;
    }
}
