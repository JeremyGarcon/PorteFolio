// Fonction pour afficher le contenu de la section sélectionnée et masquer les autres
function showContent(sectionId) {
    var sections = document.getElementsByClassName("content");
    for (var i = 0; i < sections.length; i++) {
        if (sections[i].id === sectionId) {
            sections[i].style.display = "block"; // Affiche la section sélectionnée
        } else {
            sections[i].style.display = "none"; // Masque les autres sections
        }
    }
}
