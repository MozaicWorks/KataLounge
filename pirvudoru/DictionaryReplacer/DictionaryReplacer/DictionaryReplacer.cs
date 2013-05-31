using System.Collections.Generic;
using System.Linq;

namespace DictionaryReplacer
{
    public class DictionaryReplacer
    {
        public void ReplacePlaceholderKeys(Dictionary<string, string> target)
        {
            var keys = target.Keys.Where(k => k.StartsWith("$") && k.EndsWith("$")).ToList();

            foreach (var key in keys)
            {
                var value = target[key];

                target.Remove(key);
                target.Add(value, string.Empty);
            }
        }
    }
}
