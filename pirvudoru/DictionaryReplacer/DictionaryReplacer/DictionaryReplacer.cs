using System.Collections.Generic;
using System.Linq;

namespace DictionaryReplacer
{
    public class DictionaryReplacer
    {
        private const string WildCard = "$";

        public void ReplacePlaceholderKeys(Dictionary<string, string> target)
        {
            var keys = target.Keys.Where(IsPlaceholder).ToList();

            foreach (var key in keys)
            {
                ReplaceKeyWithValue(target, key);
            }
        }

        private bool IsPlaceholder(string key)
        {
            return key.StartsWith(WildCard) && key.EndsWith(WildCard);
        }

        private void ReplaceKeyWithValue(Dictionary<string, string> target, string key)
        {
            var value = target[key];

            target.Remove(key);
            target.Add(value, value);
        }
    }
}
