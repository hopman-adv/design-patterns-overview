package structural.a_adapter


/*
* Adapter umožní propojit 2 odlišné objekty obalením jednoho z nich. Tím
* umožní spolupráci těchto objektů.
* V příkladu máme čtverce-square a kruhy-round. Máme kulaté
* díry(round peg) do kterých lze vložit jen kruhy. Použijeme adapter, který
* nám "zamaskuje" čtverec za kruh tím, že ji bude vydávat za kruh s poloměrem
* rovným polovině úhlopříčky čtverce.
* */
fun runAdapterDemo() {
    AdapterDemo().run()
}

class AdapterDemo {
    fun run() {
        // Kruh sedne do kruhu.
        val hole = RoundHole(5.0)
        val rpeg = RoundPeg(5.0)
        if (hole.fits(rpeg)) {
            println("Round peg r5 fits round hole r5.")
        }

        val smallSqPeg = SquarePeg(2.0)
        val largeSqPeg = SquarePeg(20.0)
        // hole.fits(smallSqPeg); // Nezkompiluje se.

        // Adapter solves the problem.
        // hole.fits(smallSqPeg); // Nezkompiluje se.

        // Do adaptéru vložíme squarePeg a ten apk můžeme použít do funkce fits().
        val smallSqPegAdapter = SquarePegToRoundPegAdapter(smallSqPeg)
        val largeSqPegAdapter = SquarePegToRoundPegAdapter(largeSqPeg)
        if (hole.fits(smallSqPegAdapter)) {
            println("Square peg w2 fits round hole r5.")
        }
        if (!hole.fits(largeSqPegAdapter)) {
            println("Square peg w20 does not fit into round hole r5.")
        }
    }
}