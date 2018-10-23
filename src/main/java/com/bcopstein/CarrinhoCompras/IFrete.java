package com.bcopstein.CarrinhoCompras;


public interface IFrete {
	// Custo U$1,00 por Kg (min)
	// Acima de 20 unidades, frete gratis
    double custoFrete(double peso, int qtdade);
}
