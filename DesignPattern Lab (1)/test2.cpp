#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct Item {
    int index;
    int quantity;
    int cost_rate;
};

bool compareItems(const Item& item1, const Item& item2) {
    return item1.cost_rate < item2.cost_rate;
}

int main() {
    int n, m, b;
    cin >> n >> m >> b;

    vector<Item> food_items(n);
    for (int i = 0; i < n; i++) {
        food_items[i].index = i;
        cin >> food_items[i].quantity >> food_items[i].cost_rate;
    }

    vector<Item> decoration_items(m);
    for (int i = 0; i < m; i++) {
        decoration_items[i].index = i;
        cin >> decoration_items[i].quantity >> decoration_items[i].cost_rate;
    }

    sort(food_items.begin(), food_items.end(), compareItems);
    sort(decoration_items.begin(), decoration_items.end(), compareItems);

    int max_items = 0;
    int max_items_index = -1;

    for (int i = 0; i <= n; i++) {
        int food_budget = 0;
        int decoration_budget = 0;
        int food_items_count = i;

        if (food_items_count > 0) {
            food_budget = food_items[food_items_count - 1].cost_rate * food_items[food_items_count - 1].quantity;
        }

        if (food_budget > b) {
            continue;
        }

        decoration_budget = b - food_budget;
        int decoration_items_count = decoration_budget / decoration_items[0].cost_rate;

        if (decoration_items_count > m) {
            decoration_items_count = m;
        }

        int total_items_count = food_items_count + decoration_items_count;

        if (total_items_count > max_items) {
            max_items = total_items_count;
            max_items_index = i;
        }
    }

    cout << max_items << endl;

    if (max_items_index >= 0) {
        for (int i = 0; i < max_items_index; i++) {
            cout << food_items[i].index << " ";
        }
    }

    if (max_items - max_items_index > 0) {
        for (int i = 0; i < max_items - max_items_index; i++) {
            cout << decoration_items[i].index << " ";
        }
    }

    cout << endl;

    return 0;
}
