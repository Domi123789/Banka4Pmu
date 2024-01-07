package hr.milinko.banka4pmu

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hr.milinko.banka4pmu.databinding.TekstiItemBinding

class korisnikAdapter (
    private val textList:ArrayList<korisnici>,
    private val th: Context
        ): RecyclerView.Adapter<korisnikAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): korisnikAdapter.ViewHolder {
        val v = TekstiItemBinding.inflate(LayoutInflater.from(th), parent, false)
        return ViewHolder (v)
    }

    override fun onBindViewHolder(holder: korisnikAdapter.ViewHolder, position: Int) {
        holder.bindItem(textList[position], th)
    }

    override fun getItemCount(): Int {
        return textList.size
    }

    class ViewHolder(private var itemBinding: TekstiItemBinding) :
            RecyclerView.ViewHolder(itemBinding.root){
                fun bindItem(korisnik: korisnici, th: Context){
                    itemBinding.id.text=korisnik.id.toString()
                    itemBinding.id.text=korisnik.ime
                    itemBinding.id.text=korisnik.prezime
                    itemBinding.id.text=korisnik.brojMobitela
                    itemBinding.id.text=korisnik.datRodj.toString()
                }
            }
}