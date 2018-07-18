require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.search.advanced', {
        displayName: i18n('com.mware.examples.search.advanced.react.name'),
        componentPath: 'com.mware/examples/search_advanced/React',
        savedSearchUrl: '/com.mware/examples/search_advanced/react/search'
    });

    bc.registry.registerExtension('com.mware.search.advanced', {
        displayName: i18n('com.mware.examples.search.advanced.flight.name'),
        componentPath: 'com.mware/examples/search_advanced/flight',
        savedSearchUrl: '/com.mware/examples/search_advanced/flight/search'
    });

});
