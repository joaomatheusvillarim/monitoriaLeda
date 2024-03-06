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
        Integer[] array = {4,7,2,6,8,9};
        Integer[] ordenado = {2,4,6,7,8,9};
        s.sort(array, 0, 5);
        Assert.assertArrayEquals(ordenado, array);
    }

    @Test
    public void arrayTamanhoImpar() {
        SelectionSort<Integer> s = new SelectionSort<Integer>();
        Integer[] array = {4,7,2,6,8,9,5};
        Integer[] ordenado = {2,4,5,6,7,8,9};
        s.sort(array, 0, 6);
        Assert.assertArrayEquals(ordenado, array);
    }

    @Test
    public void arrayJaOrdenado() {
        SelectionSort<Integer> s = new SelectionSort<Integer>();
        Integer[] array = {0,1,2,3,4,5,6,7,8,9};
        Integer[] ordenado = {0,1,2,3,4,5,6,7,8,9};
        s.sort(array, 0, 9);
        Assert.assertArrayEquals(ordenado, array);
    }

    @Test
    public void arrayComElementosRepetidos() {
        SelectionSort<Integer> s = new SelectionSort<Integer>();
        Integer[] array = {69,0,4,18,6,9,4,19,846,6,41};
        Integer[] ordenado = {0,4,4,6,6,9,18,19,41,69,846};
        s.sort(array, 0, 10);
        Assert.assertArrayEquals(ordenado, array);
    }

    @Test
    public void arrayOrdemReversa() {
        SelectionSort<Integer> s = new SelectionSort<Integer>();
        Integer[] array = {9,8,7,6,5,4,3,2,1,0};
        Integer[] ordenado = {0,1,2,3,4,5,6,7,8,9};
        s.sort(array, 0, 9);
        Assert.assertArrayEquals(ordenado, array);
    }

    @Test
    public void arrayDouble() {
        SelectionSort<Double> s = new SelectionSort<Double>();
        Double[] array = {5.2,8.3,0.9,4.7,5.0,0.1,57.0,3.6,0.3,47.5,3.0};
        Double[] ordenado = {0.1,0.3,0.9,3.0,3.6,4.7,5.0,5.2,8.3,47.5,57.0};
        s.sort(array, 0, 10);
        Assert.assertArrayEquals(ordenado, array);
    }

    @Test
    public void arrayString() {
        SelectionSort<String> s = new SelectionSort<String>();
        String[] array = {"Lorem", "ipsum", "dolor", "sit", "amet", "consectetur",
            "adipiscing", "elit", "Fusce", "quis"};
        String[] ordenado = {"Fusce", "Lorem", "adipiscing", "amet", "consectetur", "dolor", "elit",
            "ipsum", "quis", "sit"};
        s.sort(array, 0, 9);
        Assert.assertArrayEquals(ordenado, array);
    }

    @Test
    public void arrayChar() {
        SelectionSort<Character> s = new SelectionSort<Character>();
        Character[] array = {'J', 'F', 'M', 'A', 'M', 'J', 'J', 'A', 'S', 'O',
            'N', 'D'};
        Character[] ordenado = {'A', 'A', 'D', 'F', 'J', 'J', 'J', 'M', 'M', 'N', 'O', 'S'};
        s.sort(array, 0, 11);
        Assert.assertArrayEquals(ordenado, array);
    }

}