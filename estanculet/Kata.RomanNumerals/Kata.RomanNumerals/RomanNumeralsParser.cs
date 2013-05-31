using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Kata.RomanNumerals
{
    static class RomanNumeralsParser
    {
        public static  int Parse(string p)
        {
            int total = 0, i = 0;
            while (i < p.Length)
            {
                int val = GetNextRomanNumeralAtPosition(p, i);
                total += val;
                i += GetNumeralWidth(val);
            }
            return total;
        }

        private static int GetNextRomanNumeralAtPosition(string p, int i)
        {
            int value = 0;
            string numeral = String.Empty;
            if (i < p.Length - 1)
            {
                numeral = p.Substring(i, 2);
                numerals.TryGetValue(numeral, out value);
            }
            if (value == 0)
            {
                numeral = p.Substring(i, 1);
                value = numerals[numeral];
            }
            return value;
        }

        private static int GetNumeralWidth(int numeral)
        {
            var numeralKeyValuePair = numerals.First(
                p => p.Value == numeral);
            var numeralKey = numeralKeyValuePair.Key;
            return numeralKey.Length;
        }
        
        static IDictionary<string, int> numerals = new Dictionary<string, int>{
            {"I",1},{"V",5},{"X",10},{"D",50},{"C",100},{"L",500},{"M",1000},
            {"IV", 4}, {"IX", 9}, {"XD", 40}, {"XC",90},{"CL",500},{"CM",900}
        };
    }
}
