public class ByteOperator {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;

        System.out.println("a & b   = " + (a & b)); // 12  = ... 0000 1100
        System.out.println("a | b   = " + (a | b)); // 61  = ... 0011 1101
        System.out.println("a ^ b   = " + (a ^ b)); // 49  = ... 0011 0001
        System.out.println("~a      = " + ~a); // -61 = 1111 1111 1111 1111 1111 1111 1100 0011
        System.out.println("a << 2  = " + (a << 2)); // 240 = ... 1111 0000
        System.out.println("a >> 2  = " + (a >> 2)); // 15  = ... 0000 1111
        System.out.println("a >>> 2 = " + (a >>> 2)); // 15  = ... 0000 1111
    }
}
/*
&	Побитовый оператор и поставит единицу в бит результата, если в обоих операндах на этой позиции единица.	Бинарный	(a & b) даст 12 (… 0000_1100)
|	Побитовый оператор или поставит единицу в бит результата, если в любом из операндов на этой позиции единица.	Бинарный	(a | b) даст 61 (… 0011_1101)
^	Побитовый оператор исключающее или поставит единицу в бит результата, если на этой позиции единица в одном операнде, но не в обоих.	Бинарный	(a ^ b) даст 49 (… 0011_0001)
~	Побитовый оператор дополнения, имеет эффект «отражения» бита.	Унарный префиксный	(~ a) даст -61 (1111_1111_1111_1111_1111_1111_1100_0011)
<< 	Побитовый оператор сдвига влево. Значение левого операнда перемещается влево на количество бит, заданных правым операндом. Освободившиеся биты справа заполняются нулями.	Бинарный	a << 2 даст 240 (… 1111_0000)
b << 2 даст 52 (… 0011_0100)
>> 	Побитовый оператор сдвига вправо. Значение левого операнда перемещается вправо на количество бит, заданных правым операндом. Для положительных чисел освободившиеся крайние левых биты заполнятся нулями, для отрицательных – единицами.	Бинарный	a >> 2 даст 15 (… 0000_1111)
b >> 2 даст 3 (… 0000_0011)
(~ a >> 2) даст -16 (1111_1111_1111_1111_1111_1111_1111_0000)
>>> 	Сдвиг вправо с заполнением нулями. Значение левого операнда перемещается вправо на количество бит, заданных правым операндом, а сдвинутые значения всегда заполняются нулями.	Бинарный	a >>> 2 даст 15 (… 0000_1111)
(~a >>> 2) даст 1073741808 (0011_1111_1111_1111_1111_1111_1111_0000)
 */