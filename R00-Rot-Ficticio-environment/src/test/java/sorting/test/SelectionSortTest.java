package sorting.test;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import sorting.SelectionSort;
//se o import não funcionar, verifique o arquivo POM.XML!

@SuppressWarnings("unused")
public class SelectionSortTest {
    
    @Test
    public void arrayVazio() {
        SelectionSort<Integer> s = new SelectionSort<Integer>();
        Integer[] array = new Integer[0];
        s.sort(array, 0, 0);
        Assert.assertArrayEquals(new Integer[0], array);
    }

    @Test
    public void arrayComUmElemento() {
        SelectionSort<Integer> s = new SelectionSort<Integer>();
        Integer[] array = {1};
        Integer[] clone = {1};
        s.sort(array, 0, 0);
        Assert.assertArrayEquals(array, clone);
    }

    @Test
    public void arrayTamanhoPar() {
        SelectionSort<Integer> s = new SelectionSort<Integer>();
        Integer[] array = {23, 7, 6, 8};
        Integer[] ordenado = {6, 7, 8, 23};
        s.sort(array, 0, 3);
        Assert.assertArrayEquals(ordenado, array);
    }

    @Test
    public void arrayTamanhoImpar() {

    }

    @Test
    public void arrayAleatorioComum() {

    }

    @Test
    public void arrayJaOrdenado() {

    }

    @Test
    public void arrayComElementosRepetidos() {

    }

    @Test
    public void arrayOrdemReversa() {

    }

    @Test
    public void arrayDouble() {

    }

    @Test
    public void arrayString() {

    }

    @Test
    public void arrayChar() {}

}