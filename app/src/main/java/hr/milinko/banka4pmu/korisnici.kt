package hr.milinko.banka4pmu

import android.widget.DatePicker

data class korisnici(
    var id: Int=0,
    var ime: String,
    var prezime: String,
    var brojMobitela: String,
    var datRodj: DatePicker
)


