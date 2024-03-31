                    // JavaScript
                    document.addEventListener('DOMContentLoaded', function() {
                        // Sélectionner tous les éléments de liste avec la classe 'listItem'
                        var listItems = document.querySelectorAll('.listItem');
            
                        // Parcourir tous les éléments de liste
                        listItems.forEach(function(listItem) {
                            // Ajouter un écouteur d'événements au clic sur chaque élément de liste
                            listItem.addEventListener('click', function() {
                                // Sélectionner la sous-liste associée à l'élément de liste actuel
                                var subList = this.querySelector('.subList');
                                
                                // Basculer la visibilité de la sous-liste
                                if (subList.style.display === 'none' || subList.style.display === '') {
                                    subList.style.display = 'block';
                                } else {
                                    subList.style.display = 'none';
                                }
                            });
                        });
                    });