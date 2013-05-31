using System.Collections.Generic;
using NUnit.Framework;

namespace DictionaryReplacer.Tests
{
    [TestFixture]
    public class DictionaryReplacerTests
    {
        private DictionaryReplacer _subject;

        [SetUp]
        public void SetUp()
        {
            _subject = new DictionaryReplacer();
        }

        [Test]
        public void Replace_Always_DoesNotReplaceKeysThatDoNotStartWithDollarSign()
        {
            var dictionary = new Dictionary<string, string> { { "key", "value" } };

            _subject.ReplacePlaceholderKeys(dictionary);

            Assert.IsTrue(dictionary.ContainsKey("key"));
        }

        [Test]
        public void Replace_Always_DoestNotReplaceKeysThatOnlyHaveALeadingDollarSign()
        {
            var dictionary = new Dictionary<string, string> { { "$key", "value" } };

            _subject.ReplacePlaceholderKeys(dictionary);

            Assert.IsTrue(dictionary.ContainsKey("$key"));
        }
    }
}
