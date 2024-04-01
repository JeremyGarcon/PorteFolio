package main

import (
	"bufio"
	"fmt"
	"net"
	"os"
)

func gestionErreur(err error) {
	if err != nil {
		panic(err)
	}
}

const (
	IP   = "172.168.1.2" // Adresse IP locale
	PORT = "8080"      // Port utilisé
)

func main() {
	// Connexion au serveur
	conn, err := net.Dial("tcp", fmt.Sprintf("%s:%s", IP, PORT))
	gestionErreur(err)
	defer conn.Close()

	go lireMessagesDuServeur(conn) // Démarrer une goroutine pour lire les messages du serveur en parallèle

	for {
		// Entrée utilisateur
		reader := bufio.NewReader(os.Stdin)
		fmt.Print("client: ")
		text, err := reader.ReadString('\n')
		gestionErreur(err)

		// Envoi du message au serveur
		_, err = conn.Write([]byte(text))
		gestionErreur(err)
	}
}

func lireMessagesDuServeur(conn net.Conn) {
	for {
		message, err := bufio.NewReader(conn).ReadString('\n')
		if err != nil {
			fmt.Println("Erreur lors de la lecture du message du serveur:", err)
			return
		}
		fmt.Print("serveur: " + message)
	}
}
