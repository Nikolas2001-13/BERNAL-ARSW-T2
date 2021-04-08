api = (function () {
    return {
        getWeatherByCity: function(city, callback) {
            var promiseGetAllCases = $.getJSON(`/weather/${ city }`);
            $.when (promiseGetAllCases).done(function (data) {
                callback(data);
            });
        }
    }
})();
