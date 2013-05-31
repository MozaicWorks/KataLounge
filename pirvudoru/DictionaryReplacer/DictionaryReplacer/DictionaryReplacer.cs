using System.Collections.Generic;
using System.Linq;

namespace DictionaryReplacer
{
    public class DictionaryReplacer
    {
        private const string WildCard = "$";

        public void ReplacePlaceholderKeys(Dictionary<string, string> target)
        {
            var keys = target.Keys.Where(k => IsPlaceholder(k)).ToList();

            foreach (var key in keys)
            {
                var value = target[key];

                target.Remove(key);
                target.Add(value, value);
            }
        }

        private bool IsPlaceholder(string k)
        {
            return k.StartsWith(WildCard) && k.EndsWith(WildCard);
        }
    }
}
