require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.logout', function() {
        var seconds = 3;
        alert('Will logout in ' + seconds + ' seconds');
        _.delay(function() {
            bc.connect()
                .then(function(connected) {
                    $(document).trigger('willLogout');
                    return connected.dataRequest('user', 'logout');
                })
                .then(function() {
                    window.location.reload();
                })
        }, seconds * 1000)
        return false;
    });

});
