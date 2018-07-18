require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.map.options', {
        identifier: 'com.mware-examples-map_options-countryborders',
        optionComponentPath: 'com.mware/examples/map_options/CountryBorders'
    });

});
