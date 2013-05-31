using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Kata.RomanNumerals
{
    [TestClass]
    public class RomanNumeralsTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Assert.AreEqual(1, RomanNumeralsParser.Parse("I"));
            Assert.AreEqual(5, RomanNumeralsParser.Parse("V"));
            Assert.AreEqual(10, RomanNumeralsParser.Parse("X"));
            Assert.AreEqual(50, RomanNumeralsParser.Parse("D"));
            Assert.AreEqual(100, RomanNumeralsParser.Parse("C"));
            Assert.AreEqual(500, RomanNumeralsParser.Parse("L"));
            Assert.AreEqual(1000, RomanNumeralsParser.Parse("M"));

            Assert.AreEqual(2, RomanNumeralsParser.Parse("II"));
            Assert.AreEqual(3, RomanNumeralsParser.Parse("III"));
            Assert.AreEqual(4, RomanNumeralsParser.Parse("IV"));
            Assert.AreEqual(6, RomanNumeralsParser.Parse("VI"));
            Assert.AreEqual(9, RomanNumeralsParser.Parse("IX"));
            Assert.AreEqual(40, RomanNumeralsParser.Parse("XD"));
            Assert.AreEqual(90, RomanNumeralsParser.Parse("XC"));

            Assert.AreEqual(1090, RomanNumeralsParser.Parse("MXC"));
            Assert.AreEqual(2008, RomanNumeralsParser.Parse("MMVIII"));
            Assert.AreEqual(1990, RomanNumeralsParser.Parse("MCMXC"));


        }
    }
}
