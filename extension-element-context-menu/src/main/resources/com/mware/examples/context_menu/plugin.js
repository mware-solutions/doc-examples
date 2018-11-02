require(['public/v1/api'], function(bc) {

    bc.connect().then(function(api) {
        bc.registry.registerExtension('org.bigconnect.vertex.menu', {
            label: i18n('com.mware.examples.vertex.menu.google'),
            event: 'context-menu-search-google',
            selection: 1,
            shouldDisable: (selection, vertexId, DOMelement, vertex) => {
                return api.formatters.vertex.title(vertex) === i18n('vertex.property.title.not_available');
            },
            options: {
                insertIntoMenuItems: function(item, items) {
                    //add item under search submenu
                    var search = _.findWhere(items, { label: i18n('vertex.contextmenu.search') });
                    if (search && search.submenu) {
                        search.submenu.push(item);
                    } else {
                        items.push(item);
                    }
                }
            }
        });

        bc.registry.registerExtension('org.bigconnect.edge.menu', {
            label: i18n('com.mware.examples.edge.menu.delete'),
            event: 'context-menu-delete-edge',
            cls: 'context-menu-danger',
            options: {
                insertIntoMenuItems: function(item, items) {
                    // Add item to the end of the list
                    items.push(item);
                }
            }
        });

        $(document).on('context-menu-search-google', function(e, data) {
            api.dataRequest('vertex', 'store', {vertexIds: [data.vertexId]}).then(result => {
                var title = api.formatters.vertex.title(result[0]);
                var url = 'http://www.google.com/#safe=on&q=' + title;
                window.open(url, '_blank');
            });
        });

        $(document).on('context-menu-delete-edge', function(e, data) {
            data.edgeIds.forEach(edgeId => api.dataRequest('edge', 'delete', edgeId));
        });
    });
});
