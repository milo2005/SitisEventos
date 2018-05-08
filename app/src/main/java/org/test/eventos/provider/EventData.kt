package org.test.eventos.provider

import org.test.eventos.models.Evento
import java.util.*


object EventData {

    private var events: List<Evento>? = null

    fun listEvents(): List<Evento> {

        if (events == null) {
            events = listOf(
                    Evento("Congreso Gastronomico", "https://www.viajaporcolombia.com/images/popayan-congreso-2017.jpg",
                            Date(), "Parque Caldas", "3129876543",
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac congue dolor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus iaculis lectus euismod, dictum erat vel, gravida augue. Phasellus eget ligula et augue suscipit eleifend at id sem. Donec quam dolor, convallis et turpis eu, semper fermentum nunc. Aenean venenatis placerat dignissim. Nunc porttitor gravida porta. Nullam non eros vel quam accumsan commodo. "),
                    Evento("Semana Santa", "https://static.iris.net.co/semana/upload/images/2016/10/19/499526_1.jpg",
                            Date(), "Centro Historico", "3011234567",
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac congue dolor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus iaculis lectus euismod, dictum erat vel, gravida augue. Phasellus eget ligula et augue suscipit eleifend at id sem. Donec quam dolor, convallis et turpis eu, semper fermentum nunc. Aenean venenatis placerat dignissim. Nunc porttitor gravida porta. Nullam non eros vel quam accumsan commodo. "),
                    // Promocion("Cervezas 3x1", "https://www.elheraldo.co/sites/default/files/styles/width_860/public/articulo/2016/03/29/bogota_berr_0.jpg?itok=Dav6qHii",
                    //        "BBC", "https://enbogota.com.co/sites/default/files/styles/business-list/public/photos/10645168_10152646105916327_2726985318679232345_n_29.jpg?itok=-01nAvh6",
                    //        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac congue dolor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus iaculis lectus euismod, dictum erat vel, gravida augue. Phasellus eget ligula et augue suscipit eleifend at id sem. Donec quam dolor, convallis et turpis eu, semper fermentum nunc. Aenean venenatis placerat dignissim. Nunc porttitor gravida porta. Nullam non eros vel quam accumsan commodo. "),
                    Evento("Enanitos Verdes", "http://www.latinol.com/media/contenido/images/enanitosverdes.jpg",
                            Date(), "Plaza de Toros", "3111234567",
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac congue dolor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus iaculis lectus euismod, dictum erat vel, gravida augue. Phasellus eget ligula et augue suscipit eleifend at id sem. Donec quam dolor, convallis et turpis eu, semper fermentum nunc. Aenean venenatis placerat dignissim. Nunc porttitor gravida porta. Nullam non eros vel quam accumsan commodo. "),
                    Evento("Cuenteros", "https://c1.staticflickr.com/3/2751/4487044980_f7f9304abf_b.jpg",
                            Date(), "Pueblito Patojo", "3021234567",
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac congue dolor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus iaculis lectus euismod, dictum erat vel, gravida augue. Phasellus eget ligula et augue suscipit eleifend at id sem. Donec quam dolor, convallis et turpis eu, semper fermentum nunc. Aenean venenatis placerat dignissim. Nunc porttitor gravida porta. Nullam non eros vel quam accumsan commodo. "),
                    // Promocion("Preventa Deadpool", "https://www.laprensagrafica.com/__export/1518017224044/sites/prensagrafica/img/2018/02/07/deadpool_crop1518017223846.jpg_525981578.jpg",
                    //         "Cine Colombia", "https://pbs.twimg.com/profile_images/694207299343257600/MgQL-dc__400x400.png",
                    //         "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac congue dolor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus iaculis lectus euismod, dictum erat vel, gravida augue. Phasellus eget ligula et augue suscipit eleifend at id sem. Donec quam dolor, convallis et turpis eu, semper fermentum nunc. Aenean venenatis placerat dignissim. Nunc porttitor gravida porta. Nullam non eros vel quam accumsan commodo. "),
                    Evento("Seminario Sitis", "https://t-ec.bstatic.com/images/hotel/max1280x900/424/42417723.jpg",
                            Date(), "Hotel Monasterio", "3101234567",
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac congue dolor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus iaculis lectus euismod, dictum erat vel, gravida augue. Phasellus eget ligula et augue suscipit eleifend at id sem. Donec quam dolor, convallis et turpis eu, semper fermentum nunc. Aenean venenatis placerat dignissim. Nunc porttitor gravida porta. Nullam non eros vel quam accumsan commodo. ")
            )
        }
        return events!!
    }

}
