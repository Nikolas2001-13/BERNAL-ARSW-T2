app = (function (){

    var _module = "js/apiClient.js";
    var map;


    function _updateData(data){
        $("#name").text("Ciudad: "+data.name);
        $("#id").text("Id: "+data.id);
        $("#timezone").text("Zona Horaria: "+data.timezone);
        $("#dt").text("Dt: "+data.dt);
        $("#clouds").text("Nubes: "+data.clouds);
        $("#visibility").text("Visivilidad: "+data.visibility+"m");
        $("#base").text("Base: "+data.base);
        $("#lat").text("Latitud: "+data.coord.lat);
        $("#lon").text("Longitud: "+data.coord.lon);
        $("#wid").text("Id: "+data.weather.id);
        $("#main").text("Main: "+data.weather.main);
        $("#descrp").text("Descripción: "+data.weather.description);
        $("#icon").text("Icono: "+data.weather.icon);
        $("#temp").text("Temperatura: "+data.main.temp+"K");
        $("#feels").text("Se sienten como: "+data.main.feels_like+"K");
        $("#tmpmin").text("Temperatura min: "+data.main.temp_min+"K");
        $("#tmpmax").text("Temperatura max: "+data.main.temp_max+"K");
        $("#press").text("Presion: "+data.main.pressure+"hPa");
        $("#humed").text("Humedad: "+data.main.humidity+"%");
        $("#speed").text("Velocidad: "+data.sys.temp+"m/s");
        $("#deg").text("Deg: "+data.sys.id);
        $("#type").text("Tipo: "+data.wind.speed);
        $("#SYSid").text("Id: "+data.wind.deg);
        $("#country").text("País: "+data.sys.country);
        $("#sunrise").text("Amanecer: "+data.sys.sunrise);
        $("#sunset").text("Atardecer: "+data.sys.sunset);
        document.getElementById("info").style.visibility="visible";
        _initMap(data)
    }

    var markers;
    var bounds;

    function _initMap(data){
        map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: data.coord.lat, lng: data.coord.lon},
            zoom: 8
        });
        plotMarkers(data);
    }

    function plotMarkers(m){
        markers = [];
        bounds = new google.maps.LatLngBounds();

        m.forEach(function (marker) {
            var position = new google.maps.LatLng(marker.coord.lat, marker.coord.lng);

            markers.push(
                new google.maps.Marker({
                    position: position,
                    map: map,
                    animation: google.maps.Animation.DROP
                })
            );

            bounds.extend(position);
        });

        map.fitBounds(bounds);
    }

    return {
        getWeatherByCity: function (city) {
            $.getScript(_module, function () {
                api.getWeatherByCity(city, _updateData);
            });
        }
    }

})();
