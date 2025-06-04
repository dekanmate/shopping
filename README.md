# 🛍️ Shop Project

Ez a projekt egy egyszerű bolt-modellező alkalmazás, amelyet egyetemi feladatként készítettem Java nyelven. A projekt célja az objektumorientált programozás alapjainak gyakorlása és tesztelése.

---

## 📁 Projekt felépítése

### `customer` csomag

- **Customer**: Vásárló, aki bevásárol a boltban, kezeli a bevásárlókosarát és számolja a vásárlás összköltségét.  
- **CustomerTest**: JUnit tesztek a `Customer` osztályhoz.

### `customer.util` csomag

- **Shopper**: Interface, amelyet a vásárló megvalósít, definiálja a boltba lépést és vásárlást.  

### `shop` csomag

- **Shop**: Egy bolt, amely több terméket kezel. Nyilvántartja a készleten lévő termékek darabszámát, kezeli a termékek raktárra vételét és eltávolítását.  
- **ShopTest**: JUnit tesztek a `Shop` osztály funkcióihoz.

### `shop.products` csomag

- **Product**: Egy terméket reprezentál, amelynek típusa (`ProductType`) és ára (`price`) van.  
- **ProductTest**: JUnit tesztek a `Product` osztályhoz.

### `shop.products.util` csomag

- **ProductType**: Enumeráció, amely a terméktípusokat tartalmazza (pl. `BREAD`, `MILK`, `EGGS`).  
- **ShoppingException**: Egyedi kivétel, amelyet a vásárlási műveleteknél használunk.

---

## ✅ Fő funkciók

- 🧾 Termékek létrehozása és kezelése  
- 📦 Bolt készletének kezelése (készleten lévő termékek nyilvántartása, eltávolítás)  
- 🛒 Vásárlók bevásárlása, kosár kezelése és költségszámítás  
- 🧪 Egységtesztek az osztályok működésének ellenőrzésére **JUnit** keretrendszerrel  

---

## ▶️ Használat

1. Klónozd a repót:  

   ```bash
   git clone https://github.com/dekanmate/shopping
