package com.step.app;

/*
    Creați o aplicație consolă de tipul: Magazin de produse.

    Funcționalitate necesară:
    1. Adăugarea produselor în magazin. La lansarea aplicatiei se introduc X produse si se pastreaza in memoria interna.
    Ce informații despre produs ar trebui specificate: numele produsului, prețul de cumpărare, prețul de vânzare,
    data de expirare, descrierea, stocul (cantitatea). - DONE
    2. Afișarea întregul stoc. - DONE
    3. Vinderea un produs: se alege un produs si se specifica cantitatea necesara - aplicatia il scoate din stoc. - DONE
    4. Profit: calcularea veniturilor și afișarea profitului. - DONE
    5. Profit pe produs: calcularea profitului pentru fiecare produs individual
    (profit per produs = cantitatea x (pret de vanzare - pret de cumparare)). - DONE
    6. Sortare: afișați produsele
    1. După nume - în ordine alfabetică
    2. După data de expirare - în ordine inversă (produsele cu cea mai apropiata dată de expirare merg primele)
    3. După preț în ordine crescătoare.
    4. După preț în ordine descrescătoare.

        CE VA FI EVALUAT IN PRIMUL RAND:
        1. Respectarea principiilor OOP și separarea responsabilităților pe clasele necesare.
        2. Prezența metodelor necesare pentru a efectua operațiile descrise mai sus
        (chiar daca metoda nu este chemata sau nu este implementata logica de executie,
        va fi analizata solutia descrisa in metoda).

    FUNCȚIONALITĂȚI OPȚIONALE:
    Afisarea meniului si introducerea datelor de la tastatură nu sunt obligatorii -
    prezentați funcționalitatea aplicației in mod manual într-o clasă principală Main.

    add produs, sortarea produs, sell produs, edit

    IMPORTANT: Sarcina trebuie incarcata intr-un repozitoriu Github (ProductStore) pana la ora 21:00.
 */

import com.step.data.product.Product;
import com.step.data.product.ProductConsoleManager;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        ProductConsoleManager pcm = new ProductConsoleManager();

        pcm.add();
        pcm.showStockOfProduct(); // works
        pcm.sell();
        pcm.showTotalIncome();
        pcm.showTotalProfit();
        pcm.showProfitByProductName();
    }
}
